package org.me.entity;

/**
 * Created by kai.zang on 2017/6/2.
 */
public class ActivityRecord {
    //活动id
    private int activityId;
    //微信id
    private String userId;
    //    参加人数
    private int num;

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
