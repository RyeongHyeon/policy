
package youtube;

public class CheckedRefund extends AbstractEvent {

    private Long clientID;
    private Integer totalView;

    public Long getClientId() {
        return clientID;
    }

    public void setClientId(Long clientID) {
        this.clientID = clientID;
    }
    public Integer getTotalView() {
        return totalView;
    }

    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }
}
