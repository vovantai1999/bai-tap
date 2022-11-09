import { getPopup } from 'sweetalert2/src/utils/dom/getters.js'
import { renderActions } from 'sweetalert2/src/utils/dom/renderers/renderActions.js'
import { renderContainer } from 'sweetalert2/src/utils/dom/renderers/renderContainer.js'
import { renderContent } from 'sweetalert2/src/utils/dom/renderers/renderContent.js'
import { renderFooter } from 'sweetalert2/src/utils/dom/renderers/renderFooter.js'
import { renderCloseButton } from 'sweetalert2/src/utils/dom/renderers/renderCloseButton.js'
import { renderIcon } from 'sweetalert2/src/utils/dom/renderers/renderIcon.js'
import { renderImage } from 'sweetalert2/src/utils/dom/renderers/renderImage.js'
import { renderProgressSteps } from 'sweetalert2/src/utils/dom/renderers/renderProgressSteps.js'
import { renderTitle } from 'sweetalert2/src/utils/dom/renderers/renderTitle.js'
import { renderPopup } from 'sweetalert2/src/utils/dom/renderers/renderPopup.js'

/**
 * @param {SweetAlert2} instance
 * @param {SweetAlertOptions} params
 */
export const render = (instance, params) => {
  renderPopup(instance, params)
  renderContainer(instance, params)

  renderProgressSteps(instance, params)
  renderIcon(instance, params)
  renderImage(instance, params)
  renderTitle(instance, params)
  renderCloseButton(instance, params)

  renderContent(instance, params)
  renderActions(instance, params)
  renderFooter(instance, params)

  if (typeof params.didRender === 'function') {
    params.didRender(getPopup())
  }
}
