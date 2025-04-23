class Movie:
    def __init__(self):

        self.movies = {}

    def add_movie(self, title: str):

        if title not in self.movies:
            self.movies[title] = []
            return f"'{title}' has been added to the system."
        return f"'{title}' already exists in the system."

    def rate_movie(self, title: str, rating: int):

        if title not in self.movies:
            return f"'{title}' does not exist in the system. Please add it first."
        if 1 <= rating <= 5:
            self.movies[title].append(rating)
            return f"Rating of {rating} added for '{title}'."
        return "Rating must be between 1 and 5."

    def get_average_rating(self, title: str):
        average = sum(self.movies[title]) / len(self.movies[title])
        return f"The average rating for '{title}' is {average:.2f}."

    def get_average_rating_for_all_movie(self):
        all_ratings = [rating for ratings in self.movies.values() for rating in ratings]
        average = sum(all_ratings) / len(all_ratings)
        return f"The average rating for all movies is {average:.2f}."

