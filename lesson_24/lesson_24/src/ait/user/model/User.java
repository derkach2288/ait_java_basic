package ait.user.model;

public class User {
    private String email;
    private String password;

    /*
    TODO Homework
    1) Min 8 symbols
    2) Min one symbol in uppercase
    3) Min one symbol ip lowercase
    4) Min one symbol is digit
    5) Min one symbol is a special symbol (!%@*&)
     */

    public User(String email, String password) {
        setEmail(email); // чтоб выполнилась проверка в конструкторе при создании
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (emailIsValid(email)) {
            this.email = email;
        } else {
            System.out.println(email + "is not valid");
        }
    }

    /*
    1) @ должна юыть только одна
    2) '.' - минимум одна точка после @
    3) min two symbols after last dot
    4) ALPHABETIC, digits, @ . _ -
     */
    private boolean emailIsValid(String email) {
        int at = email.indexOf('@'); // метод строки, ищет собачку в электронке, если встретит - вернет индекс, если нет - вернет -1
        if (at==-1 || email.lastIndexOf('@')!= at) { // если индекс с конца неравен индексу сначала - значит более одной собачки
            return false;
        }
        if (email.indexOf('.', at+1)==-1){ // ищем точку, начиная с индекса следующего, после собачки (at+1)
            return false;
        }
        if (email.lastIndexOf('.')>=email.length()-2){ // минимум два символа после последней точки
            return false;
        }

        for (int i = 0; i < email.length(); i++) { // 4) ALPHABETIC, digits, @ . _ -
            char c = email.charAt(i);
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c=='_' || c=='-')){ // Character.isDigit(c) проверяет на наличие цифры, возвращает тру или фолс || Character.isAlphabetic(c) проверяет на наличие буквы, возвращает тру или фолс
                return false;
            }

        }

        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (passwordValid(password)) {
            this.password = password;
        } else {
            System.out.println(password + "is not valid");
        }
    }

    private boolean passwordValid(String password) {
        int counter = 0;

        if (password.length()>=8){
            counter++;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)){
                counter++;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)){
                counter++;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                counter++;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c=='!' || c=='%' || c=='@' || c=='*' || c=='&'){
                counter++;
                break;
            }
        }





        if (counter != 5) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
