// Task 1

// Body me ek div add kar through js 
// and in this div add h1 h2 heading 
// after that add paragraph before h1

// const mainDiv = document.createElement("div"); //create html element;
// mainDiv.className = "mainDiv"; //add class on html element;
// mainDiv.textContent = "I am Main Div";

// document.body.appendChild(mainDiv); //add main div into html;

// const head1 = document.createElement("h1");
// head1.textContent = "I am Heading 1";

// const head2 = document.createElement("h2");
// head2.textContent = "I am Heading 2";

// const p = document.createElement("p");
// p.textContent = "I am Paragraph";

// mainDiv.appendChild(p) //add paragraph into main div;
// mainDiv.appendChild(head1) //add h1 into main div;
// mainDiv.appendChild(head2) //add h2 into main div;

const b1 = document.createElement("button");
const b2 = document.createElement("button");
const b3 = document.createElement("button");
const b4 = document.createElement("button");
const mainDiv = document.createElement("div");
const h1 = document.createElement("h1");
const h2 = document.createElement("h2");
const p = document.createElement("p");

b1.textContent = "Open Main Div";
b1.addEventListener("click", openMain);
document.body.appendChild(b1);


function openMain(){

    document.body.removeChild(b1);

    b2.textContent = "add h1 into main div";
    b2.addEventListener("click", addH1);

    mainDiv.className = "mainDiv";
    mainDiv.textContent = "I am MainDiv";

    document.body.appendChild(mainDiv);
    document.body.appendChild(b2);
}

function addH1() {
    document.body.removeChild(b2);
    
    b3.textContent = "add h2 into main div";
    b3.addEventListener("click", addH2)
    
    h1.textContent = "I am H1";
    mainDiv.appendChild(h1);
    
    document.body.appendChild(b3);
}

function addH2(){
    document.body.removeChild(b3);

    h2.textContent = "I am H2";
    mainDiv.appendChild(h2);

    b4.textContent = "Add P into main div";
    b4.addEventListener("click", addP);

    document.body.appendChild(b4);
}

function addP(){
    document.body.removeChild(b4);

    p.textContent = "I am Paragraph";

    mainDiv.appendChild(p);
}