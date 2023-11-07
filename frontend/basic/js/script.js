const ul = document.querySelector("ul");
fetch(`http://localhost:1200/student`).then(res => res.json()).then(res => {
    const lis = `
        <li>${res.roll}</li>
        <li>${res.name}</li>
        <li>${res.fee}</li>
    `;
    ul.innerHTML = lis;
});