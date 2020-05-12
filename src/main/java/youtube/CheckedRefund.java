
package youtube;

public class CheckedRefund extends AbstractEvent {

    private String clientID;
    private Integer totalView;

    public String getClientId() {
        return clientID;
    }

    public void setClientId(String clientID) {
        this.clientID = clientID;
    }
    public Integer getTotalView() {
        return totalView;
    }

    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }
}
