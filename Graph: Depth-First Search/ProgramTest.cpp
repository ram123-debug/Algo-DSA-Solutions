// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

class ProgramTest : public TestSuite {
public:
  void Run() {
    RunTest("Test Case 1", []() {
      Node graph("A");
      graph.addChild("B")->addChild("C")->addChild("D");
      graph.children[0]->addChild("E")->addChild("F");
      graph.children[2]->addChild("G")->addChild("H");
      graph.children[0]->children[1]->addChild("I")->addChild("J");
      graph.children[2]->children[0]->addChild("K");

      vector<string> expected{"A", "B", "E", "F", "I", "J",
                              "C", "D", "G", "K", "H"};
      vector<string> inputArray{};
      assert(graph.depthFirstSearch(&inputArray) == expected);
    });
  }
};
