import { swalClasses } from 'sweetalert2/src/utils/classes.js'
import * as dom from 'sweetalert2/src/utils/dom'

/**
 * @param {SweetAlert2} instance
 * @param {SweetAlertOptions} params
 */
export const renderImage = (instance, params) => {
  const image = dom.getImage()

  if (!params.imageUrl) {
    return dom.hide(image)
  }

  dom.show(image, '')

  // Src, alt
  image.setAttribute('src', params.imageUrl)
  image.setAttribute('alt', params.imageAlt)

  // Width, height
  dom.applyNumericalStyle(image, 'width', params.imageWidth)
  dom.applyNumericalStyle(image, 'height', params.imageHeight)

  // Class
  image.className = swalClasses.image
  dom.applyCustomClass(image, params, 'image')
}
