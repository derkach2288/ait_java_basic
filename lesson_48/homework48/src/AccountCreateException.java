import java.util.List;

public class AccountCreateException extends Exception{
    private List<String> errorList;

    public AccountCreateException(List<String> erorList) {
        this.errorList = erorList;
    }

    public List<String> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }
}
