public class JsonpFluid {
    public static void main(String[] args) {
        JsonObject game = Json.createObjectBuilder()
            .add("name", "Mastermind")
            .add("pieces",
                Json.createObjectBuilder()
                    .add("decoding_board", 
                        Json.createObjectBuilder()
                            .add("total_count", 1)))
                    .add("pegs", 
                        Json.createArrayBuilder()
                            .add(Json.createObjectBuilder()
                                .add("type", "code")
                                .add("count", 72)
                                ))
    }
}
