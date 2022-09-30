delimiter //
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_deposit_c6`(
	IN sFullName varchar(100),
    IN sEmail varchar(50),
    IN sPhone varchar(11),
    IN sAddress varchar(50),
    IN sTransactionAmount decimal(12,0)
)
begin
	declare total decimal(12,0);
    declare sCustomerId integer;
    
    # Kiem tra customer_id co ton tai hay chua
    if(not exists (SELECT `email` FROM `customers` where `email` COLLATE utf8mb4_0900_ai_ci like sEmail)) then 
		INSERT INTO `customers` (`full_name`, `email`, `phone`, `address`, `balance`, `deleted`) VALUES (sFullName, sEmail, sPhone, sAddress, '0', '0');
    end if;
    
    set sCustomerId = (SELECT id FROM `customers` where `email` COLLATE utf8mb4_0900_ai_ci like sEmail);
	INSERT INTO `deposits` (`created_at`, `deleted`, `customer_id`, `transaction_amount`) VALUES (now(), '0', sCustomerId, sTransactionAmount);
    
    set total = (SELECT balance from customers where id = sCustomerId);
    set total = total + sTransactionAmount;
    
    UPDATE `customers` SET `balance` = total WHERE (`id` = sCustomerId);

end //

