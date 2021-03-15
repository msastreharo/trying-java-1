function returnFizzBuzz() {
    const submittedNumber = document.getElementById("number").value;
    fetch(`/fizzbuzz?number=${submittedNumber}`)
        .then(result => result.text())
        .then(finalResult => document.getElementById("result").append(finalResult))
}

const submitButton = document.getElementById("submit-button");

submitButton.addEventListener("click", returnFizzBuzz,false)