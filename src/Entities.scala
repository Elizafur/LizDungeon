object Entities	{
	import publicVariables._
	/* ---- LOW LEVEL ---- */
	def Slime =	{
		enemyHP = 13;
		mDAM = 6;
		mMiss = 20;
	}
	def Lizard =	{
		enemyHP = 6;
		mDAM = 8;
		mMiss = 10;
	}
	/* ---- /LOW LEVEL ---- */
	
	/* ---- MID LEVEL ---- */
		//Add a mid level monster?
	/* ---- /MID LEVEL ---- */
	
	/* ---- HIGH LEVEL ---- */
	def Drake =	{
		enemyHP = 35;
		mDAM = 17;
		mMiss = 35;
	}
	def Matt =	{
		enemyHP = 50;
		mDAM = 13;
		mMiss = 40;
	}
	/* ---- /HIGH LEVEL ---- */
	
	/* ---- BOSS ---- */
	def KingKelman =	{
		enemyHP = 100;
		mDAM = 15;
		mMiss = 7;
		boss = true;
	}
	/* ---- /BOSS ---- */
}