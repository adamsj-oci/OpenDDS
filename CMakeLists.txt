cmake_minimum_required(VERSION 3.5)

project(opendds)

execute_process(
  COMMAND ./configure --doc-group
  WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}
  OUTPUT_FILE "out.txt"
  ERROR_FILE "err.txt"
)

# ament_package()

# install(
#   DIRECTORY include/
#   DESTINATION include
# )

# install(
#   TARGETS rmw_opendds_cpp
#   ARCHIVE DESTINATION lib
#   LIBRARY DESTINATION lib
#   RUNTIME DESTINATION bin
# )
