from movies import Movie

def main():
    movie_system = Movie()
    while True:
        print("\nMovie App Options:")
        print("1. Add a movie")
        print("2. Rate a movie")
        print("3. Get average rating for a movie")
        print("4. Get average rating of all movies in the app")
        print("5. Exit")
        choice = input("Enter your choice (1-5): ")

        if choice == "1":
            title = input("Enter the movie title: ")
            print(movie_system.add_movie(title))

        elif choice == "2":
            title = input("Enter the movie title: ")
            try:
                rating = int(input("Enter the rating (1-5): "))
                print(movie_system.rate_movie(title, rating))
            except ValueError:
                print("Invalid input. Please enter a number between 1 and 5.")

        elif choice == "3":
            title = input("Enter the movie title: ")
            print(movie_system.get_average_rating(title))
        elif choice == "4":
            print(movie_system.get_average_rating_for_all_movie())


        elif choice == "5":
            break

if __name__ == "__main__":
    main()
