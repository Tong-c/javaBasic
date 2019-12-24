package com.tong.logic.chapterEleven;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskQueue {


    private static Comparator<Task> taskComparator = new Comparator<Task>() {
        @Override
        public int compare(Task o1, Task o2) {
            if (o1.getPriority() > o2.getPriority()) {
                return -1;
            } else if (o1.getPriority() < o2.getPriority()) {
                return 1;
            }
            return 0;
        }
    };


    static class Task {
        int priority;
        String name;

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
