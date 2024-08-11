package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks ;
    private Set<Task> unassignedTasks ;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name){
        if(name.equals("ann")){
            return annsTasks;
        } else if (name.equals("bob")){
            return bobsTasks;
        } else if (name.equals("carol")) {
            return carolsTasks;
        }else{
            return unassignedTasks;
        }
    }
    public Set<Task> getUnion(Set<Task> taskData1,Set<Task> taskData2){
        taskData1.addAll(taskData2);
        return taskData1;
    }
    public Set<Task> getIntersection(Set<Task> taskData1,Set<Task> taskData2){

        taskData1.retainAll(taskData2);
        return taskData1;
    }
    public Set<Task> getDifferences(Set<Task> taskData1,Set<Task> taskData2){

        taskData1.removeAll(taskData2);
        return taskData1;
    }
}
