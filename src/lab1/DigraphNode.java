package lab1;

<<<<<<< HEAD
/*this is branch C4 second change*/
=======
/*this is branch C4 second change*/
>>>>>>> C4
public class DigraphNode
{
	String Words;
	DigraphNode Next;
	int Weight;
	int AdjPointNumber;//表示多少个点与表头节点连接
	boolean flag = false;

	public DigraphNode()
	{
		Next = null;
		AdjPointNumber = 0;
	}
}