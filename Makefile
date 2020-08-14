build-app:
	@echo "Building project..."
	@./gradlew build

package:
	@echo "Packaging project..."
	@./gradlew check assemble

clean:
	@echo "Cleaning project..."
	@./gradlew clean

# docker-build:
# 	@echo "Building Docker image..."
# 	@./gradlew build && docker build -t activity-tracker .

# docker-run:
# 	@echo "Running Docker container..."
# 	@docker run -m512M --cpus 2 -it -p 8080:8080 --rm activity-tracker

tests:
	@echo "Running project tests..."
	@./gradlew test

lint:
	@echo "Linting project..."
	@ktlint --color --color-name="RED"

format:
	@echo "Formatting Kotlin resources (src/**/*.kt)...";ktlint -F "src/**/*.kt";echo "Done."
	@echo "\nFormatting Kotlin test resources (test/**/*.kt)..."; ktlint -F "test/**/*.kt";echo "Done."