package com.rmn.testrail.entity;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by jsteigel on 7/14/14.
 */
public class PlanEntryRun extends BaseEntity {
    @JsonProperty("assignedto_id")
    private Integer assignedToId;
    public Integer getAssignedToId() { return assignedToId; }
    public void setAssignedToId(Integer assignedToId) { this.assignedToId = assignedToId; }

    @JsonProperty("include_all")
    private boolean includeAll;
    public boolean getIncludeAll() { return includeAll; }
    public void setIncludeAll(boolean includeAll) { this.includeAll = includeAll; }

    @JsonProperty("case_ids")
    private List<Integer> caseIds;
    public List<Integer> getCaseIds() { return caseIds; }
    public void setCaseIds(List<Integer> caseIds) { this.caseIds = caseIds; }

    @JsonProperty("config_ids")
    private List<Integer> configIds;
    public List<Integer> getConfigIds() { return configIds; }
    public void setConfigIds(List<Integer> configIds) { this.configIds = configIds; }
}
