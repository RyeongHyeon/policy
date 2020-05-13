package youtube;

public class ModifiedPolicy extends AbstractEvent {

    private Long policyId;
    private Long refundPolicy;
    private String deleteVideoName;
    private Integer violationCount;

    // 강령현 추가
    private int adMin;
    private int adCnt;
    private int adPrice;

    public ModifiedPolicy(){
        super();
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
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
