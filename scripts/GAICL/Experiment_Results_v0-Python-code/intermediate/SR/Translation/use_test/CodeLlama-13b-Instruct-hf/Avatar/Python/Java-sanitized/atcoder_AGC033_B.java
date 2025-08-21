int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
RobotMover robotMover = new RobotMover(new Robot(3, 3, 0, 0, 2, 2), board, 0, 0, 2, 2);
RobotSolver robotSolver = new RobotSolver(robotMover, board, 0, 0, 2, 2);
String solution = robotSolver.solve();
System.out.println(solution);