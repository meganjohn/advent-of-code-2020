const fs = require('fs');

try {
    // read contents of the file
    const data = fs.readFileSync('passwords.txt', 'UTF-8');
    // split the contents by new line
    const lines = data.split(/\r?\n/);
    let numberOfValidPasswords = 0;
    
    lines.forEach((line) => {
        let validPassword = false;

        const criteriaAndPassword = line.split(" ");
        const passwordArray = criteriaAndPassword[2].split("");
        const charRequired = criteriaAndPassword[1].split("")[0];
        const [firstPositionRequired, secondPositionRequired] = criteriaAndPassword[0].split("-");

        if (passwordArray[firstPositionRequired-1] == charRequired &&
            passwordArray[secondPositionRequired-1] !== charRequired) {
                validPassword = true;
        } else if (passwordArray[firstPositionRequired-1] !== charRequired &&
                passwordArray[secondPositionRequired-1] == charRequired) {
                    validPassword = true;
        }
        if (validPassword) {
            numberOfValidPasswords++;
        }
    });
    console.log(numberOfValidPasswords);
} catch (err) {
    console.error(err);
}
