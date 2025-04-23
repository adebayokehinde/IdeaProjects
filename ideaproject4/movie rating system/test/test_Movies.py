import unittest
from movies import Movie

class TestMovie(unittest.TestCase):
    def setUp(self):
        self.movie_system = Movie()

    def test_add_movie(self):
        result = self.movie_system.add_movie("Avatar")
        self.assertEqual(result, "'Avatar' has been added to the system.")
        self.assertIn("Avatar", self.movie_system.movies)

    def test_add_same_movie(self):
        self.movie_system.add_movie("Avatar")
        result = self.movie_system.add_movie("Avatar")
        self.assertEqual(result, "'Avatar' already exists in the system.")

    def test_rate_movie(self):
        self.movie_system.add_movie("Avatar")
        result = self.movie_system.rate_movie("Avatar", 5)
        self.assertEqual(result, "Rating of 5 added for 'Avatar'.")
        self.assertEqual(self.movie_system.movies["Avatar"], [5])

    def test_rate_nonexistent_movie(self):
        result = self.movie_system.rate_movie("Avatar", 4)
        self.assertEqual(result, "'Avatar' does not exist in the system. Please add it first.")

    def test_get_average_rating(self):
        self.movie_system.add_movie("the boys")
        self.movie_system.rate_movie("the boys", 5)
        self.movie_system.rate_movie("the boys", 3)
        result = self.movie_system.get_average_rating("the boys")
        self.assertEqual(result, "The average rating for 'the boys' is 4.00.")

    def test_get_average_rating_for_all_movies(self):
        self.movie_system.add_movie("power rangers")
        self.movie_system.rate_movie("power rangers", 5)
        self.movie_system.add_movie("the boys")
        self.movie_system.rate_movie("the boys", 3)
        result = self.movie_system.get_average_rating_for_all_movie()
        self.assertEqual(result, "The average rating for all movies is 4.00.")


