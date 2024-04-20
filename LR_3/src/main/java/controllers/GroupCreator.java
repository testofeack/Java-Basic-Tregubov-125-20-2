package controllers;
import controllers.Creator;
import models.Group;

public class GroupCreator extends Creator {
    public Group createGroup(String groupName, int groupSize) {
        return new Group(groupName,  groupSize);
    }
}