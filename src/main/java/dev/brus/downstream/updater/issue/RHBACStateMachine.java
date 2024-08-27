package dev.brus.downstream.updater.issue;

public class RHBACStateMachine implements DownstreamIssueStateMachine {

    private static final String ISSUE_STATE_TODO = "Refinement";
    private static final String ISSUE_STATE_DEV_COMPLETE = "In Progress";

    @Override
    public int getStateIndex(String state) {
        switch (state) {
            case "New":
                return 0;
            case "Refinement":
                return 1;
            case "In Progress":
                return 2;
            case "Closed":
                return 3;
            default:
                throw new IllegalStateException("Invalid state: " + state);
        }
    }

    @Override
    public String getNextState(String fromState, String toState) {
        return toState;
    }

    @Override
    public String getIssueStateToDo() {
        return ISSUE_STATE_TODO;
    }

    @Override
    public String getIssueStateDevComplete() {
        return ISSUE_STATE_DEV_COMPLETE;
    }
}
