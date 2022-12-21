package org.example;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AVLTreeTest extends TestCase {

    @Mock
    AVLTree treeMock;

    @Test
    public void testTreeMocking() {
        List<AVLTree> TreeMockList = new ArrayList<AVLTree>();
        AVLTree Tree1 = new AVLTree();
        int MockNum1 = 5;
        int MockNum2 = 15;
        int MockNum3 = 52;
        int MockNum4 = 13;
        int MockNum5 = 10;
        int MockNum6 = 2;
        int MockNum7 = 21;
        int MockNum8 = 27;

        Tree1.root = Tree1.insertNode(Tree1.root, MockNum1);
        Tree1.root = Tree1.insertNode(Tree1.root, MockNum2);
        Tree1.root = Tree1.insertNode(Tree1.root, MockNum3);
        Tree1.root = Tree1.insertNode(Tree1.root, MockNum4);
        Tree1.root = Tree1.insertNode(Tree1.root, MockNum5);
        Tree1.root = Tree1.insertNode(Tree1.root, MockNum6);
        Tree1.root = Tree1.insertNode(Tree1.root, MockNum7);
        Tree1.root = Tree1.insertNode(Tree1.root, MockNum8);
        Tree1.printTree(Tree1.root, "", true);
        TreeMockList.add(Tree1);
    }

    @Test
    public void testTreeMocking2() {
        List<AVLTree> TreeMockList = new ArrayList<AVLTree>();
        AVLTree Tree2 = new AVLTree();
        int MockNum1 = 10;
        int MockNum2 = 21;
        int MockNum3 = 88;
        int MockNum4 = 16;
        int MockNum5 = 22;
        int MockNum6 = 3;
        int MockNum7 = 14;
        int MockNum8 = 99;

        Tree2.root = Tree2.insertNode(Tree2.root, MockNum1);
        Tree2.root = Tree2.insertNode(Tree2.root, MockNum2);
        Tree2.root = Tree2.insertNode(Tree2.root, MockNum3);
        Tree2.root = Tree2.insertNode(Tree2.root, MockNum4);
        Tree2.root = Tree2.insertNode(Tree2.root, MockNum5);
        Tree2.root = Tree2.insertNode(Tree2.root, MockNum6);
        Tree2.root = Tree2.insertNode(Tree2.root, MockNum7);
        Tree2.root = Tree2.insertNode(Tree2.root, MockNum8);
        Tree2.printTree(Tree2.root, "", true);
        TreeMockList.add(Tree2);
    }

    @Test
    public void testTreeMocking3() {
        List<AVLTree> TreeMockList = new ArrayList<AVLTree>();
        AVLTree Tree3 = new AVLTree();
        int MockNum1 = 1;
        int MockNum2 = 2;
        int MockNum3 = 8;
        int MockNum4 = 16;
        int MockNum5 = 76;
        int MockNum6 = 44;
        int MockNum7 = 12;
        int MockNum8 = 55;

        Tree3.root = Tree3.insertNode(Tree3.root, MockNum1);
        Tree3.root = Tree3.insertNode(Tree3.root, MockNum2);
        Tree3.root = Tree3.insertNode(Tree3.root, MockNum3);
        Tree3.root = Tree3.insertNode(Tree3.root, MockNum4);
        Tree3.root = Tree3.insertNode(Tree3.root, MockNum5);
        Tree3.root = Tree3.insertNode(Tree3.root, MockNum6);
        Tree3.root = Tree3.insertNode(Tree3.root, MockNum7);
        Tree3.root = Tree3.insertNode(Tree3.root, MockNum8);
        Tree3.printTree(Tree3.root, "", true);
        TreeMockList.add(Tree3);
    }

    @Test
    public void testTreeMocking4() {
        List<AVLTree> TreeMockList = new ArrayList<AVLTree>();
        AVLTree Tree4 = new AVLTree();
        int MockNum1 = 1;
        int MockNum2 = 2;
        int MockNum3 = 3;
        int MockNum4 = 4;
        int MockNum5 = 5;
        int MockNum6 = 6;
        int MockNum7 = 7;
        int MockNum8 = 8;

        Tree4.root = Tree4.insertNode(Tree4.root, MockNum1);
        Tree4.root = Tree4.insertNode(Tree4.root, MockNum2);
        Tree4.root = Tree4.insertNode(Tree4.root, MockNum3);
        Tree4.root = Tree4.insertNode(Tree4.root, MockNum4);
        Tree4.root = Tree4.insertNode(Tree4.root, MockNum5);
        Tree4.root = Tree4.insertNode(Tree4.root, MockNum6);
        Tree4.root = Tree4.insertNode(Tree4.root, MockNum7);
        Tree4.root = Tree4.insertNode(Tree4.root, MockNum8);
        Tree4.printTree(Tree4.root, "", true);
        TreeMockList.add(Tree4);
    }
}