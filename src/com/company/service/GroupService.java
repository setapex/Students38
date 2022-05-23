package com.company.service;

import com.company.repository.GroupRepository;
import com.company.model.Group;

import java.util.List;

public class GroupService {
    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void addGroups(List<Group> newGroups) {
        groupRepository.addGroup(newGroups);
    }

    public void removeGroup(List<Group> removeGroups) {
        removeGroups.forEach(gr -> System.out.println(gr));
        groupRepository.removeGroups(removeGroups);
    }
}
