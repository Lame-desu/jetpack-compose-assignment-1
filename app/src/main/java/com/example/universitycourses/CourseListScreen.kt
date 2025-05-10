package com.example.universitycourses

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.tooling.preview.Preview
import com.example.universitycourses.ui.theme.UniversityCoursesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseListScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("University Courses") }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            items(courseList) { course ->
                CourseCard(course = course)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    UniversityCoursesTheme {
        CourseListScreen()
    }
}