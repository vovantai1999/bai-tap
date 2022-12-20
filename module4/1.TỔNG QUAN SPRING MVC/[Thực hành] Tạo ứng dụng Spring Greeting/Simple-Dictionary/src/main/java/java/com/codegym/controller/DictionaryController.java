package java.com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.com.codegym.model.Dictionary;
import java.com.codegym.service.DictionaryService;
import java.com.codegym.service.IDictionaryService;
import java.util.List;

@Controller
public class DictionaryController {
    private static final IDictionaryService dictionaryService = new DictionaryService();

    @GetMapping("/search")
    public String search(){
        return "index";
    }

    @PostMapping("/result")
    public String dictionary(@RequestParam String word, Model model){
        List<Dictionary> dictionaries = dictionaryService.findAll();
        boolean flag = false;
        for (Dictionary dictionary : dictionaries){
            if(word.equalsIgnoreCase(dictionary.getEn())){
                model.addAttribute("word", dictionary.getEn());
                model.addAttribute("result", dictionary.getVi());
                flag = true; break;
            }
        }
        if(flag){
            return "result";
        }
        else {
            model.addAttribute("word", word);
            model.addAttribute("error", "Khong co trong tu dien. Vui long nhap lai");
            return "index";
        }

    }
}