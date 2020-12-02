const fs = require('fs');

try {
    // read contents of the file
    const data = fs.readFileSync('passwords.txt', 'UTF-8');
    // split the contents by new line
    const lines = data.split(/\r?\n/);
    let numberOfValidPasswords = 0;

    lines.forEach((line) => {

        const criteriaAndPassword = line.split(" ");

        const password = criteriaAndPassword[2];
        const charRequired = criteriaAndPassword[1].split("")[0];
        const matchCriteria = new RegExp(charRequired, 'g');
        const [lowerBoundCriteria, upperBoundCriteria] = criteriaAndPassword[0].split("-");
        const numberOfRequiredChar = (password.match(matchCriteria) || []).length;

        if (lowerBoundCriteria <= numberOfRequiredChar && numberOfRequiredChar <= upperBoundCriteria) {
                numberOfValidPasswords += 1
            }

    });
    console.log(numberOfValidPasswords);
} catch (err) {
    console.error(err);
}

