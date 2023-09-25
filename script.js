
function copyMenu(){
var dptCategory = document.querySelector('.dpt-cat')
var dptPlace = document.querySelector('.departments')
dptPlace.innerHTML = dptCategory.innerHTML;

var mainNav = document.querySelector('.header-nav nav')
var navPlace = document.querySelector('.off-canvas nav')
navPlace.innerHTML = mainNav.innerHTML;

var topNav = document.querySelector('.header-top .wrapper')
var topPlace = document.querySelector('.off-canvas .thetop-nav')
topPlace.innerHTML = topNav.innerHTML

}
copyMenu()



const menuButton = document.querySelector('.trigger'),
      closeButton = document.querySelector('.t-close'),
      addclass = document.querySelector('.site');

      menuButton.addEventListener('click', ()=>{
        addclass.classList.toggle('showmenu')
      })
    closeButton.addEventListener('click', ()=>{
        addclass.classList.remove('showmenu')
    })








const submenu = document.querySelectorAll('.has-child .icon-small')
submenu.forEach((menu) => menu.addEventListener('click', toggle))

function toggle(e) {
    e.preventDefault();
    submenu.forEach((item) => item != this ? item.closest('.has-child').classList.remove('expand') : null);
    if (this.closest('.has-child').classList != 'expand');
    this.closest('.has-child').classList.toggle('expand')
}


var stocks = document.querySelectorAll('.products .stock')
for(let i=0;i<stocks.length;i++){
  let stock = stocks[i].dataset.stock,
  available = stocks[i].querySelector('.qty-available').innerHTML,
  sold = stocks[i].querySelector('.qty-sold').innerHTML,
  percent = sold*100/stock;

  stocks[i].querySelector('.available').style.width = percent+ '%';
}






const swiper = new Swiper('.swiper', {
    loop: true,
  
    // If we need pagination
    pagination: {
      el: '.swiper-pagination',
    },
    
  });


  const searchButton = document.querySelector('.t-search'),
        tClose = document.querySelector('.search-close'),
        showClass = document.querySelector('.site')

searchButton.addEventListener('click',()=>[
  showClass.classList.toggle('showsearch')
])
tClose.addEventListener('click',()=>[
  showClass.classList.remove('showsearch')
])



const dptButton = document.querySelector('.dpt-cat .dpt-trigger'),
      dptClass = document.querySelector('.site')

dptButton.addEventListener('click', ()=>{
  dptClass.classList.toggle('showdpt')
})




var productThumb = new Swiper('.small-image', {
  
  loop: true,
  spaceBetween: 10,
  slidesPerView: 3,
  freeMode: true,
  watchSlidesProgress: true,
  breakpoints: {
    481: {
      spaceBetween: 32,
    }
  }
});
// console.log("yes")
var productBig = new Swiper('.big-image', {
  loop: true,
  autoHeight: true,
  navigation: {
    nextEl: '.swiper-button-next',
    prevEl: '.swiper-button-prev',
  },
  thumbs: {
    swiper : productThumb,
  }
});








const divtoshow = '.mini-cart'
const divpopup = document.querySelector(divtoshow);
const divTrigger = document.querySelector('.cart-trigger')
divTrigger.addEventListener('click',()=>{
  setTimeout(()=>{
    if(!divpopup.classList.contains('show')){
      divpopup.classList.add('show')
    }
  },250)
})
document.addEventListener('click',(e)=>{
  const isClosest = e.target.closest(divtoshow)
  if(!isClosest && divpopup.classList.contains('show')){
    divpopup.classList.remove('show')
  }
})

// window.onload = () => {
//   document.querySelector('.site').classList.toggle('showmodal')
// }
// document.querySelector('.modalclose').addEventListener('click',()=>{
//   document.querySelector('.site').classList.remove('showmodal')
// })