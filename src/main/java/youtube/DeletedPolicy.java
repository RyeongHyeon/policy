package youtube;

public class DeletedPolicy extends AbstractEvent {

    private String policyId;
    private Long refundPolicy;
    private String deleteVideoName;
    private Integer violationCount;
    private Long deleteVideoId;

    // 강령현 추가
    private int adMin;
    private int adCnt;
    private int adPrice;

    public DeletedPolicy(){
        super();
    }
    public Long getDeleteVideoId() {
        return deleteVideoId;
    }

    public void setDeleteVideoId(Long deleteVideoId) {
        this.deleteVideoId = deleteVideoId;
    }


    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
    public Long getRefundPolicy() {
        return refundPolicy;
    }

    public void setRefundPolicy(Long refundPolicy) {
        this.refundPolicy = refundPolicy;
    }
    public String getDeleteVideoName() {
        return deleteVideoName;
    }

    public void setDeleteVideoName(String deleteVideoName) {
        this.deleteVideoName = deleteVideoName;
    }
    public Integer getViolationCount() {
        return violationCount;
    }

    public void setViolationCount(Integer violationCount) {
        this.violationCount = violationCount;
    }

    public int getAdMin() {
        return adMin;
    }

    public void setAdMin(int adMin) {
        this.adMin = adMin;
    }

    public int getAdCnt() {
        return adCnt;
    }

    public void setAdCnt(int adCnt) {
        this.adCnt = adCnt;
    }

    public int getAdPrice() {
        return adPrice;
    }

    public void setAdPrice(int adPrice) {
        this.adPrice = adPrice;
    }
}
