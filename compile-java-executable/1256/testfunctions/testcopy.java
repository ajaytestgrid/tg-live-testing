class testcopy {

	public static void testcopy() {
		tg.wait("ele_emailaddre934", ComparisonType.IS_VISIBLE);
		tg.click("ele_emailaddre934", 1);
		tg.wait("ele_emailaddre934", ComparisonType.IS_VISIBLE);
		tg.type("ele_emailaddre934", "test");
		tg.wait("ele_password962", ComparisonType.IS_VISIBLE);
		tg.click("ele_password962", 1);
		tg.wait("ele_password962", ComparisonType.IS_VISIBLE);
		tg.typeEncrypted("ele_password962", "ztDWA1mKeqUNzthlctyj9Q==:MTIzNDU2Nzg5MTAxMTEyMQ==");
	}
}