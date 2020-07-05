package day17.project03.sevice;

public class TeamException extends RuntimeException {

    static final long serialVersionUID = -703489715766939L;

    public TeamException() {
        super();
    }

    public TeamException(String msg){
        super(msg);
    }


}
