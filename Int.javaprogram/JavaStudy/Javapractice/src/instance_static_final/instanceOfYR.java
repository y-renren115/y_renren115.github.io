package instance_static_final;

public class instanceOfYR {

		private int id = 0;
		private static int staticVarId = 0;

		public void incrementId(String name) {
			id++;
			instanceOfYR.staticVarId++;

			System.out.println("id:var=" +id);
			System.out.println("staticVarId:" +instanceOfYR.staticVarId);

		}
}
