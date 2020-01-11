javascript: (function() {
    document.getElementById(".age").href = "javascript: void(0)";
    var appBanners = document.getElementsByClassName('dt_social_single');
    for (var i = 0; i < appBanners.length; i ++) {
    appBanners[i].style.display = 'none';
    }
})()
