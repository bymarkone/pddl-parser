package org.gerryai.planning.parser.pddl.integration.example.gripper;

import org.gerryai.planning.model.ConstantDefinition;
import org.gerryai.planning.model.problem.Goal;
import org.gerryai.planning.parser.pddl.integration.ProblemSuccessTester;
import org.junit.Test;

import static org.gerryai.planning.model.logic.FormulaBuilder.and;
import static org.gerryai.planning.model.logic.FormulaBuilder.constant;
import static org.gerryai.planning.model.logic.FormulaBuilder.predicate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Integration test to check that the Gripper example files are parsed correctly.
 */
public class GripperPb4IT extends ProblemSuccessTester {

    protected String getFilePath() {
        return "pddl/example/gripper/pb4.pddl";
    }

    @Test
    public void gripperProblem1HasCorrectName() {
        assertEquals("pb4", problem.getName());
    }

    @Test
    public void gripperProblem1HasCorrectDomain() {
        assertEquals("gripper", problem.getDomainName());
    }

    @Test
    public void gripperProblem1HasNoRequirements() {
        assertEquals(0, problem.getRequirements().asSet().size());
    }

    @Test
    public void gripperProblem1Has12Objects() {
        assertEquals(12, problem.getObjects().asSet().size());
    }

    @Test
    public void gripperProblem1HasObjectRoomA() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("rooma")));
    }

    @Test
    public void gripperProblem1HasObjectRoomB() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("roomb")));
    }

    @Test
    public void gripperProblem1HasObjectBall1() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("ball1")));
    }

    @Test
    public void gripperProblem1HasObjectBall2() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("ball2")));
    }

    @Test
    public void gripperProblem1HasObjectBall3() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("ball3")));
    }

    @Test
    public void gripperProblem1HasObjectBall4() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("ball4")));
    }

    @Test
    public void gripperProblem1HasObjectBall5() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("ball5")));
    }

    @Test
    public void gripperProblem1HasObjectBall6() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("ball6")));
    }

    @Test
    public void gripperProblem1HasObjectBall7() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("ball7")));
    }

    @Test
    public void gripperProblem1HasObjectBall8() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("ball8")));
    }

    @Test
    public void gripperProblem1HasObjectLeft() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("left")));
    }

    @Test
    public void gripperProblem1HasObjectRight() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("right")));
    }

    @Test
    public void gripperProblem1Has23StateTerms() {
        assertEquals(23, problem.getInitialState().asSet().size());
    }

    @Test
    public void gripperProblem1InitialStateHasRoomA() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("room", constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasRoomB() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("room", constant("roomb"))));
    }

    @Test
    public void gripperProblem1InitialStateHasBall1() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("ball", constant("ball1"))));
    }

    @Test
    public void gripperProblem1InitialStateHasBall2() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("ball", constant("ball2"))));
    }

    @Test
    public void gripperProblem1InitialStateHasBall3() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("ball", constant("ball3"))));
    }

    @Test
    public void gripperProblem1InitialStateHasBall4() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("ball", constant("ball4"))));
    }

    @Test
    public void gripperProblem1InitialStateHasBall5() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("ball", constant("ball5"))));
    }

    @Test
    public void gripperProblem1InitialStateHasBall6() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("ball", constant("ball6"))));
    }

    @Test
    public void gripperProblem1InitialStateHasBall7() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("ball", constant("ball7"))));
    }

    @Test
    public void gripperProblem1InitialStateHasBall8() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("ball", constant("ball8"))));
    }

    @Test
    public void gripperProblem1InitialStateHasGripperLeft() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("gripper", constant("left"))));
    }

    @Test
    public void gripperProblem1InitialStateHasGripperRight() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("gripper", constant("right"))));
    }

    @Test
    public void gripperProblem1InitialStateHasArRobby() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at-robby", constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasFreeLeft() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("free", constant("left"))));
    }

    @Test
    public void gripperProblem1InitialStateHasFreeRight() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("free", constant("right"))));
    }

    @Test
    public void gripperProblem1InitialStateHasAtBall1() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("ball1"), constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasAtBall2() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("ball2"), constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasAtBall3() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("ball3"), constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasAtBall4() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("ball4"), constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasAtBall5() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("ball5"), constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasAtBall6() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("ball6"), constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasAtBall7() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("ball7"), constant("rooma"))));
    }

    @Test
    public void gripperProblem1InitialStateHasAtBall8() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("ball8"), constant("rooma"))));
    }

    @Test
    public void gripperProblem1HasGoal() {
        Goal goal = new Goal(
                and(
                        predicate("at", constant("ball1"), constant("roomb")),
                        predicate("at", constant("ball2"), constant("roomb")),
                        predicate("at", constant("ball3"), constant("roomb")),
                        predicate("at", constant("ball4"), constant("roomb")),
                        predicate("at", constant("ball5"), constant("roomb")),
                        predicate("at", constant("ball6"), constant("roomb")),
                        predicate("at", constant("ball7"), constant("roomb")),
                        predicate("at", constant("ball8"), constant("roomb"))));
        assertEquals(goal, problem.getGoal());
    }
}