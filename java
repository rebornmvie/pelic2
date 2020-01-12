javascript: (function() {
    var atop = document.getElementsByClassName('nota1');
    if (atop.length > 0) {
    atop[0].parentNode.removeChild(atop[0]);
    }
    if (document.getElementById('dtw_socialbox-2')) {
    document.getElementById('dtw_socialbox-2').style.display = 'none';
    }
    var ctn = document.getElementsByClassName('content');
    if (ctn.length > 0) {
    var p = ctn[0].getElementsByTagName('p');
    ctn[0].removeChild(p[0]);
    }

    var sbox = document.getElementsByClassName('dt_social_single');
    if (sbox.length > 0) {
    sbox[0].parentNode.removeChild(sbox[0]);
    }
    if (document.getElementById('clickfakeplayer')) {
    document.getElementById('clickfakeplayer').href = 'javascript: void(0)' +
    }
    var dlbox = document.getElementsByClassName('box_links');
    if (dlbox.length > 0) {
    dlbox[0].parentNode.removeChild(dlbox[0]);
    }
})());
