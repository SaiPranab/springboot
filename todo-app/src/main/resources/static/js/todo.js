const checkBox = document.getElementById('checkbox');

checkBox.addEventListener('click', e => {
    const id = e.target.dataset.id;
    location.href = "/complete?id=" + id;
});