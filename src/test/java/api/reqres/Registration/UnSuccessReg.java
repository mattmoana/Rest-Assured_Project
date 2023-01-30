package api.reqres.Registration;

public class UnSuccessReg {

    private String error;

    public UnSuccessReg(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
