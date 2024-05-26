package models;

import models.enums.GateStatus;
import models.enums.GateType;

public class Gate extends BaseModel{
    private int gateNumber;
    private GateStatus gateStatus;
    private GateType gateType;
    private String operatorName;

    public Gate() {
    }

    public Gate(int gateNumber, GateStatus gateStatus, GateType gateType, String operatorName) {
        this.gateNumber = gateNumber;
        this.gateStatus = gateStatus;
        this.gateType = gateType;
        this.operatorName = operatorName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
