class MobileNavbar {
  constructor(mobileMenu, navList, navLinks) {
    this.mobileMenu = document.querySelector(mobileMenu);
    this.navList = document.querySelector(navList);
    this.navLinks = document.querySelectorAll(navLinks);
    this.activeClass = "active";
    this.handleClick = this.handleClick.bind(this);
  }

  animateLinks() {
    this.navLinks.forEach((link, index) => {
      link.style.animation
        ? (link.style.animation = "")
        : (link.style.animation = `navLinkFade 0.5s ease forwards ${
          index / 7 + 0.3
        }s`);
    });
  }

  handleClick() {
    this.navList.classList.toggle(this.activeClass);
    this.mobileMenu.classList.toggle(this.activeClass);
    this.animateLinks();
  }

  addClickEvent() {
    this.mobileMenu.addEventListener("click", this.handleClick);
  }

  init() {
    if (this.mobileMenu) {
      this.addClickEvent();
    }
    return this;
  }
}

const mobileNavbar = new MobileNavbar(
  ".mobile-menu",
  ".nav-list",
  ".nav-list li",
);
mobileNavbar.init();
document.querySelector("select").onchange = function(){
  console.log(this.selectedIndex);//选中项下标
  console.log(this.options[this.selectedIndex].innerText);//选中项文本
  console.log(this.options[this.selectedIndex].value);//选中项value
}
$("select").change(function(){

  console.log($(this).children("option:selected").text())//选中option标签里的文本值
  console.log($(this).find("option:selected").val())//选中内容

  console.log($(this).children("option:selected").index())//选中下标
  console.log($(this).find("option:selected").index())//选中下标

  console.log($(this).prop("selectedIndex")//选中下标
})