package lvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.AssertTrue;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Logistics {
    private String id;
    private String vOrgId;
    private String vpid;
    private String vid;
    private String mOrgId;
    private String mpid;
    private String sOrgId;
    private String spid;
    private String lOrgId;
    private String lpid;
    private String spName;
    private double spWight;
    private int spNumber;
    private String category; // fixed or variable rendezvous
    private String rendezous;
    private String  supLoc; // supplier location
    private List<String> destinations;
    private String timeStamp;
}
