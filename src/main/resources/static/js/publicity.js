$(function() {
    // 1.点击上部的li，当前li 添加current类，其余兄弟移除类
    $(".article-nav li").mousemove(function() {
        // 链式编程操作
        $(this).addClass("cur").siblings().removeClass("cur");
        // 2.点击的同时，得到当前li 的索引号
        var index = $(this).index();
        console.log(index);
        // 3.让下部里面相应索引号的item显示，其余的item隐藏
        $(".article-list .article-list-cont").eq(index).show().siblings().hide();
    });
})