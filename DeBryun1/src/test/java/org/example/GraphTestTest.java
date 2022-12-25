package org.example;

import com.mathsystem.api.graph.GraphFactory;
import com.mathsystem.api.graph.model.Graph;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;

public class GraphTestTest {

    @Test
    void MyTest1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/simpleDeBruin.txt"));

        DeBryunGraphCheck GraphTest = new DeBryunGraphCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(true);
    }

    @Test
    void MyTest2() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/definitelyNotDeBruine.txt"));

        DeBryunGraphCheck GraphTest = new DeBryunGraphCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }

    @Test
    void MyTest3() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/harderDeBruin.txt"));

        DeBryunGraphCheck GraphTest = new DeBryunGraphCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(true);
    }

    @Test
    void MyTest4() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/yetNotDeBruin.txt"));

        DeBryunGraphCheck GraphTest = new DeBryunGraphCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }

    @Test
    void MyTest5() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/pileOfDots.txt"));

        DeBryunGraphCheck GraphTest = new DeBryunGraphCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }

    @Test
    void MyTest6() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/noGraphAtAll.txt"));

        DeBryunGraphCheck GraphTest = new DeBryunGraphCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }

    @Test
    void MyTest7() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/threeVertexDeBruin.txt"));

        DeBryunGraphCheck GraphTest = new DeBryunGraphCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(true);
    }

    @Test
    void MyTest8() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/nineVertexDeBruin.txt"));

        DeBryunGraphCheck GraphTest = new DeBryunGraphCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(true);
    }


}
