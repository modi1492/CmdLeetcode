import basic.Employee;

import java.util.*;

public class EmployeeImportance {
    public static void main(String[] args) {

    }

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        Employee employee = map.get(id);
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(employee);
        int ans = 0;
        while (!queue.isEmpty()) {
            Employee poll = queue.poll();
            ans += poll.importance;
            for (Integer s : poll.subordinates) {
                queue.offer(map.get(s));
            }
        }
        return ans;
    }
}

// https://leetcode.cn/problems/Employee-Importance