import java.util.*;

public class conf {

    static List<Integer>[] conflictGraph;
    static boolean[] visitedNode;
    static int[] skillLevels;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeCount = scanner.nextInt(); 
        int conflictCount = scanner.nextInt(); 

        conflictGraph = new ArrayList[employeeCount + 1];
        for (int i = 0; i <= employeeCount; i++) {
            conflictGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < conflictCount; i++) {
            int empA = scanner.nextInt();
            int empB = scanner.nextInt();
            conflictGraph[empA].add(empB);
            conflictGraph[empB].add(empA);
        }

        skillLevels = new int[employeeCount + 1];
        for (int i = 1; i <= employeeCount; i++) {
            skillLevels[i] = scanner.nextInt();
        }

        visitedNode = new boolean[employeeCount + 1];
        int totalBestExpertise = 0;

        for (int emp = 1; emp <= employeeCount; emp++) {
            if (!visitedNode[emp]) {
                List<Integer> connectedGroup = new ArrayList<>();
                explore(emp, connectedGroup);

                if (connectedGroup.size() <= 25) {
                    totalBestExpertise += maxExpertiseByBitmask(connectedGroup);
                } else {
                    totalBestExpertise += greedyExpertise(connectedGroup);
                }
            }
        }

        System.out.println(totalBestExpertise);
    }

    static void explore(int current, List<Integer> groupList) {
        visitedNode[current] = true;
        groupList.add(current);
        for (int neighbor : conflictGraph[current]) {
            if (!visitedNode[neighbor]) {
                explore(neighbor, groupList);
            }
        }
    }

    static int maxExpertiseByBitmask(List<Integer> subGroup) {
        int groupSize = subGroup.size();
        int[] nodeToIndex = new int[1001];
        int[] skillArray = new int[groupSize];
        int[] conflictMask = new int[groupSize];

        for (int i = 0; i < groupSize; i++) {
            int employee = subGroup.get(i);
            nodeToIndex[employee] = i;
            skillArray[i] = skillLevels[employee];
        }

        for (int i = 0; i < groupSize; i++) {
            int empU = subGroup.get(i);
            for (int empV : conflictGraph[empU]) {
                if (nodeToIndex[empV] != 0 || subGroup.get(0) == empV) {
                    conflictMask[i] |= (1 << nodeToIndex[empV]);
                }
            }
        }

        int bestSum = 0;
        int totalMasks = 1 << groupSize;

        for (int mask = 0; mask < totalMasks; mask++) {
            boolean conflictFree = true;
            int localSum = 0;

            for (int bit = 0; bit < groupSize; bit++) {
                if ((mask & (1 << bit)) != 0) {
                    if ((conflictMask[bit] & mask) != 0) {
                        conflictFree = false;
                        break;
                    }
                    localSum += skillArray[bit];
                }
            }

            if (conflictFree) {
                bestSum = Math.max(bestSum, localSum);
            }
        }

        return bestSum;
    }

    static int greedyExpertise(List<Integer> subList) {
        subList.sort((empX, empY) -> Integer.compare(skillLevels[empY], skillLevels[empX]));
        Set<Integer> chosen = new HashSet<>();
        Set<Integer> restricted = new HashSet<>();

        for (int emp : subList) {
            if (!restricted.contains(emp)) {
                chosen.add(emp);
                for (int adj : conflictGraph[emp]) {
                    restricted.add(adj);
                }
            }
        }

        int total = 0;
        for (int emp : chosen) {
            total += skillLevels[emp];
        }

        return total;
    }
}
