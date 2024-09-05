package dev.brus.downstream.updater.issue;

public class RHBACStateMachine implements DownstreamIssueStateMachine {

    private static final String ISSUE_STATE_TODO = "To Do";
    private static final String ISSUE_STATE_DEV_COMPLETE = "Review";

    @Override
    public int getStateIndex(String state) {
        switch (state) {
            case "New":
                return 0;
            case "Backlog":
                return 1;
            case "To Do":
                return 2;
            case "In Progress":
                return 3;
            case "Review":
                return 4;
            case "Closed":
                return 5;
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
