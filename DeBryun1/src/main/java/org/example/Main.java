package org.example;

import com.mathsystem.api.graph.GraphFactory;
import com.mathsystem.api.graph.model.Graph;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("simpleDeBruin.txt");
        File s1 = new File("src/test/resources/simpleDeBruin.txt");
        Graph graph1 = GraphFactory.loadGraphFromFile(s1);
        DeBryunGraphCheck g1 = new DeBryunGraphCheck();
        System.out.println(g1.execute(graph1));

        System.out.println("definitelyNotDeBruine.txt");
        File s2 = new File("src/test/resources/definitelyNotDeBruine.txt");
        Graph graph2 = GraphFactory.loadGraphFromFile(s2);
        DeBryunGraphCheck g2 = new DeBryunGraphCheck();
        System.out.println(g2.execute(graph2));

        System.out.println("harderDeBruin.txt");
        File s3 = new File("src/test/resources/harderDeBruin.txt");
        Graph graph3 = GraphFactory.loadGraphFromFile(s3);
        DeBryunGraphCheck g3 = new DeBryunGraphCheck();
        System.out.println(g3.execute(graph3));

        System.out.println("yetNotDeBruin.txt");
        File s4 = new File("src/test/resources/yetNotDeBruin.txt");
        Graph graph4 = GraphFactory.loadGraphFromFile(s4);
        DeBryunGraphCheck g4 = new DeBryunGraphCheck();
        System.out.println(g4.execute(graph4));

        System.out.println("pileOfDots.txt");
        File s5 = new File("src/test/resources/pileOfDots.txt");
        Graph graph5 = GraphFactory.loadGraphFromFile(s5);
        DeBryunGraphCheck g5 = new DeBryunGraphCheck();
        System.out.println(g5.execute(graph5));



        System.out.println("noGraphAtAll.txt");
        File s6 = new File("src/test/resources/noGraphAtAll.txt");
        Graph graph6 = GraphFactory.loadGraphFromFile(s6);
        DeBryunGraphCheck g6 = new DeBryunGraphCheck();
        System.out.println(g6.execute(graph6));


        System.out.println("threeVertexDeBruin.txt");
        File s7 = new File("src/test/resources/threeVertexDeBruin.txt");
        Graph graph7 = GraphFactory.loadGraphFromFile(s7);
        DeBryunGraphCheck g7 = new DeBryunGraphCheck();
        System.out.println(g7.execute(graph7));

        System.out.println("nineVertexDeBruin.txt");
        File s8 = new File("src/test/resources/nineVertexDeBruin.txt");
        Graph graph8 = GraphFactory.loadGraphFromFile(s8);
        DeBryunGraphCheck g8 = new DeBryunGraphCheck();
        System.out.println(g8.execute(graph8));

    }
}