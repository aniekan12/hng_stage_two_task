package com.ani.hngfirsttask.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ani.hngfirsttask.ui.theme.Typography


@Composable
fun Heading1Text(text: Int, textAlign: TextAlign, padding: Int? = 0, modifier: Modifier) {
    Text(
        textAlign = textAlign,
        text = stringResource(text),
        style = Typography.h3.copy(fontWeight = FontWeight.Bold),
        modifier = modifier,
    )
}

@Composable
fun Heading4Text(text: Int) {
    Text(
        text = stringResource(text),
        style = Typography.h6.copy(),
//        modifier = modifier,
    )
}

@Composable
fun BodyText(text: String, fontWeight: FontWeight, modifier: Modifier = Modifier.padding()) {
    Text(
        modifier = modifier,
        text = text,
        style = Typography.body1.copy(fontWeight = fontWeight),
    )
}