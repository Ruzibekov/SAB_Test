package com.ruzibekov.sab_test.screens.address

import android.R.attr.text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ruzibekov.sab_test.ui.theme.SAB_TestTheme

@Composable
fun MyAddressesScreen() {
    Scaffold(
        topBar = {

        }
    ) {

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Мои адреса",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 16.dp),
        )

        Text(
            text = "Toshkent",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Column {
            listOf(
                "КАНАЛОВСКИЙ РЕГИОН",
                "ВЫПУСТИТЕЛЬНОСТЬ",
                "МОРЩИЦА"
            ).forEach { item ->
                Text(
                    text = "• $item",
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
        }

        Divider(modifier = Modifier.padding(vertical = 16.dp))

        // Задание
        Text(
            text = "Задание",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "• Добавить адрес в избранное ул. Узбекистан Океля, 2",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Список времени
        LazyColumn {
            items(404) { index ->
                Text(
                    text = "${index + 1}:00",
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
        }
    }
}

@Composable
fun AddressCard(title: String, address: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.elevatedCardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )

            Text(text = address)
        }
    }
}

@Preview
@Composable
private fun MyAddressesScreenPreview() {
    SAB_TestTheme { }
}