package mtc.bean.a_type.bean;

public class Child {

    // 当前的小孩子想玩球
    private String wantToy = "ball";

    public String getWantToy() {
        return wantToy;
    }


    @Override
    public String toString() {
        return "Child{" + "wantToy='" + wantToy + '\'' + '}';
    }

}
