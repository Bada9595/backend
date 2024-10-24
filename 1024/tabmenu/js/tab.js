// const targetLink = document.querySelectorAll('.tab_menu a');
// const tabContent = document.querySelectorAll('#tabContent>div');

// //targetLink 배열을 forEach로 순회
// targetLink.forEach(function(link){

//     link.addEventListener('click',function(e){
//         e.preventDefault(); //링크금지
//         let orgTarget = e.target.getAttribute('href');
//         //클릭(e.target) - this로 변경 가능
//         //getAttribute 는 href, src 속성값을 읽어옴
//         //alert(orgTarget); #tabs1, #tqbs2, #tabs3
//         let tabTarget = orgTarget.replace("#","");
//         //#tab1 에서 #을 빈문자열로 대체 -> tab1
//         //alert(tabTarget); 

//         //모든 tabContent의 내용을 안보이게 설정
//         tabContent.forEach(function(content){
//             content.style.display = "none";
//         });
//         //클릭한 탭만보이게 설정
//         document.getElementById(tabTarget).style.display="block";

//         targetLink.forEach(function(link2){
//             link2.classList.remove('active');
//             e.target.classList.add('active');
//         });
//     });
// });
$(function(){
    $('.tab_menu a').click(function(){
        let orgTarget = $(this).attr('href');
        // alert(orgTarget);
        $('#tabContent > div').hide();

        $(orgTarget).show();
        $('.tab_menu a').removeClass('active');
        $(this).addClass('active');


        return false;
    });


});